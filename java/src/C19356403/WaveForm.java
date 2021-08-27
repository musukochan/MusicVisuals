package C19356403;

import processing.core.*;
import processing.core.PApplet;

// This is an example of a visual that renders the waveform
public class WaveForm
{
    MyVisual mv;
    float cy = 0;

    public WaveForm(MyVisual mv)
    {
        this.mv = mv;
        cy = this.mv.height / 6;
    }

    public void render()
    {
        mv.colorMode(PApplet.RGB, 128,0,255,128);


        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 25, 125)
                , 200
                , 150
            );

            mv.line(i, cy+5, i, cy + cy * 2*(mv.getAudioBuffer().get(i)));
            mv.line(i*-1, cy-55, i*-1, cy + cy * -2*(mv.getAudioBuffer().get(i)));
        }
    }

    public void render2()
    {
        mv.colorMode(PApplet.RGB, 128,0,255,128);


        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                    PApplet.map(i, 0, mv.getAudioBuffer().size(), 25, 125)
                    , 200
                    , 150
            );

            mv.line(i, cy+5, i, cy + cy * 2*(mv.getAudioBuffer().get(i)));
            mv.line(i*-1, cy+3, i*-1, cy + cy * -2*(mv.getAudioBuffer().get(i)));
        }
    }

}