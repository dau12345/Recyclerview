package com.example.recyclerview;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData() {
        ArrayList<Photo> photos = new ArrayList<Photo>();
        photos.add(new Photo(0, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg", "Apple Park aerial view",
                "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, United States"));
        photos.add(new Photo(1, "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Apple_Garage.jpg/1280px-Apple_Garage.jpg", "Garage of Steve Jobs' parents",
                "In 1976, Steve Jobs co-founded Apple in his parents' home on Crist Drive in Los Altos, California. Although it is widely believed that the company was founded in the house's garage, Apple co-founder Steve Wozniak called it a bit of a myth. Jobs and Wozniak did, however, move some operations to the garage when the bedroom became too crowded."));
        photos.add(new Photo(2, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Apple_I_Computer.jpg/1920px-Apple_I_Computer.jpg", "Apple 1 On display at the Smithsonian",
                "Apple's first product, the Apple I, designed by Steve Wozniak, was sold as an assembled circuit board and lacked basic features such as a keyboard, monitor, and case. The owner of this unit added a keyboard and wooden case."));
        photos.add(new Photo(3, "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Apple_II_Plus%2C_Museum_of_the_Moving_Image.jpg/1920px-Apple_II_Plus%2C_Museum_of_the_Moving_Image.jpg", "The Apple II Computer",
                "The Apple II Plus, introduced in 1979, designed primarily by Wozniak."));
        photos.add(new Photo(4, "https://upload.wikimedia.org/wikipedia/commons/c/cf/Macintosh%2C_Google_NY_office_computer_museum_cropped.png", "Cropped, Color adjusted version of Macintosh",
                "The Macintosh, released in 1984, is the first mass-market personal computer to feature an integral graphical user interface and mouse."));
        photos.add(new Photo(5, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Apple_PenLite_prototype%2C_1992.jpg/1920px-Apple_PenLite_prototype%2C_1992.jpg", "Apple PenLite prototype (1992)",
                "The PenLite is Apple's first prototype of a tablet computer. Created in 1992, the project was designed to bring the Mac OS to a tablet – but was canceled in favor of the Newton."));
        return photos;
    }
    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> photos = generatePhotoData();
        for (int i = 0; i < photos.size(); i++) {
            if (photos.get(i).getId() == id) {
                return photos.get(i);
            }
        }
        return null;
    }
}
