package com.level.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "image")

public class Image {
    private int id;
    private String type;
    private String imageName;
    private String path;
    private String formatFile;

    private User user;



    public Image() {
        path = null;
    }

    public Image(String type, String imageName, String path, String formatFile){
        super();
        this.type = type;
        this.imageName = imageName;
        this.path = path;
        this.formatFile = formatFile;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")

    public int getId() {
        return id;
    }

    public void setId(int idImage) {
        this.id = idImage;
    }

    @Column (name = "imageType")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column (name = "imageName")
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Column (name = "filePath")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column (name = "formatFile")
    public String getFormatFile() {
        return formatFile;
    }

    public void setFormatFile(String formatFile) {
        this.formatFile = formatFile;
    }


    @Override
    public String toString() {
        return imageName + " " + path + " "
                + formatFile;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
