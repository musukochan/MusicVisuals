package C19356403;

import processing.core.PApplet;

public class CUBE
{
    MyVisual c;

    float CubeStart = -5000; // closest to the front that cube can be
    float CubeMax = 500; // furthest from the front that cube can be

    float CubeX, CubeY, CubeZ;
    float rotateX, rotateY, rotateZ;
    float sumX, sumY, sumZ;

    CUBE(MyVisual c)
    {
        this.c = c;

        CubeX = c.random(-600 , c.width);  // randomizes location of cube spawn point
        CubeY = c.random(-300 , c.height);
        CubeZ = c.random(CubeStart, CubeMax);

        rotateX = c.random (-2, 10); // speed of rotation of cubes
        rotateY = c.random (-2, 10);
        rotateZ = c.random (-2, 10);

    }

    void display()
    {
        c.fill(PApplet.map(c.getAmplitude() * 20, 100, 20, 0, 100), 255, 255, c.getAmplitude() * 420); // colour of cube
        c.stroke(c.color(50,  100 + (250 * c.getAmplitude()))); // colour of cube net
        c.strokeWeight(1 + (c.getAmplitude() * 10));
        c.pushMatrix();

        c.translate(CubeX, CubeY, CubeZ);

        sumX += c.getAmplitude() * (rotateX / 2);
        sumY += c.getAmplitude() * (rotateY / 2);
        sumZ += c.getAmplitude() * (rotateZ / 2);

        c.rotateX(sumX); // rotates cubes
        c.rotateY(sumY);
        c.rotateZ(sumZ);

        float boxSize = 60 + (100 * c.getSmoothedAmplitude()); // calculates cube size
        c.box(boxSize);
        c.popMatrix();

        CubeZ += ((CubeMax * c.getAmplitude()) * 0.5f) + 1; //  how fast the cube travels from spawn point to exit point off screen
        if (CubeZ >= CubeMax)
        {
            CubeZ = CubeStart;
        }

    }
}