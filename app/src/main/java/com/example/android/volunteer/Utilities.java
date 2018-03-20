package com.example.android.volunteer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by shubham on 7/15/17.
 */

public class Utilities {


    public static ArrayList<ngo> parse(String json) {
        ArrayList<ngo> values = new ArrayList<ngo>();
                //for (int j=0;j<10;j++)
            //    values.add(new ngo(title, desc, imageUrl, ngoName, 10, new String[]{""}
            //            , new int[]{0}, posixDate,System.currentTimeMillis() / 1000L,id));
            values.add(new ngo("Clean Street","A cleaning drive is being organised in xyz locality. People are requested to cooperate",
                                null,"New Horizon",10,new String[]{"Cleaning","hard working"},new int[]{0},1521571414,System.currentTimeMillis() / 1000L,12));
        values.add(new ngo("Hackathon","A Hackathon is being organised on xyz college for 36 hours.",
                null,"Ashok NGO",30,new String[]{"Cleaning","hard working","Technical Knowledge","cooperative"},new int[]{0},1521655414,System.currentTimeMillis() / 1000L,13));

        values.add(new ngo("Green-a-thon","A Coding event challenging innovative thinkers of all nations to find sustainable solutions for making world a greener place",
                null,"PPAP NGO",30,new String[]{"Cleaning","hard working","Technical Knowledge","cooperative"},new int[]{0},1521655414,System.currentTimeMillis() / 1000L,14));

        values.add(new ngo("Tech-Rush","A 5km run(for technology) and fun.",
                null,"NeedPlay",20,new String[]{"Enthusiastic","hard working"},new int[]{0},1521739414,System.currentTimeMillis() / 1000L,15));

        values.add(new ngo("E-Mitra","A 24-hour engaging session for e-mitra kiosk owners to connect their innovative ideas with electronic media for enhancing the use of e-mitra services",
                null,"NeedPlay",50,new String[]{"Good social skills,Calm minded"},new int[]{0},1521739414,System.currentTimeMillis() / 1000L,16));

        values.add(new ngo("EduHack"," Teacher's hackathon intended to find path-breaking solutions for building a better and smarter Education System",
                null,"Ashok NGO",20,new String[]{"Passionate","Hard working"},new int[]{0}, 1521823414,System.currentTimeMillis() / 1000L,17));

        values.add(new ngo("Expo","Biggest technological exhibition unveiling the latest E-Governance inventions done by Government of Rajasthan",
                null,"Blue Bird",10,new String[]{"Passionate","Technical Knowledge"},new int[]{0},1521823414,System.currentTimeMillis() / 1000L,18));

            return values;
    }
}
