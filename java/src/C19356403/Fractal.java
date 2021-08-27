package C19356403;

import processing.core.*;

public class Fractal {

    MyVisual tr;
    float width;
    float height;
    float y = 400;
    float x = 400;
    float angle;
    float dia = 20;

    public Fractal(MyVisual tr)
    {
        this.tr=tr;
    }

    public void render()
    {

        tr.translate(tr.width/2f, tr.height/2f);
        tr.rotate(PApplet.radians(14+angle/3));
        tr.beginShape();
        for (float a = 0; a < 360; a+=10)  // loop to rotate
        {
            tr.pushMatrix();
            if(angle<360) //if statement for effect in first 360 degrees
            {
                tr.rotate(PApplet.radians(a)*PApplet.cos(PApplet.radians(angle)));
            }
            else
            {
                tr.rotate(PApplet.radians(a));
            }
            tr.stroke(PApplet.map(tr.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255); //colour
            tr.strokeWeight(3);
            tr.line(x*PApplet.sin(PApplet.radians(angle)), 0, 0, y-dia/2); //render ellipse shape
            tr.endShape();

            tr.noStroke();
            tr.fill(255);
            tr.ellipse(x*PApplet.sin(PApplet.radians(angle)), 0, dia/2, dia/2); //render ellipse shape
            tr.stroke(PApplet.map(tr.getSmoothedAmplitude()*3, 0, 1, 0, 255), 255, 255); //colour
            tr.noFill();
            tr.ellipse(0, y, dia, dia);
            tr.popMatrix();
        }
        angle++;

    }

}
