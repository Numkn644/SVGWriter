package jp.sagalab.svgwriter;

import org.jfree.graphics2d.svg.SVGGraphics2D;
import org.jfree.graphics2d.svg.SVGUtils;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by inuma on 2017/12/05.
 */
public class SVGWriter {
  public static void main(String[] args){
    System.out.println("Hello World!!");
    SVGGraphics2D g2d = new SVGGraphics2D(640, 480);
    g2d.draw(new Rectangle(50, 50, 100, 150));
    String svgElement = g2d.getSVGElement();

    try{
      SVGUtils.writeToSVG(new File("test.svg"), svgElement);
    }catch (IOException ex){
      System.out.println(ex.getStackTrace());
    }
  }
}
