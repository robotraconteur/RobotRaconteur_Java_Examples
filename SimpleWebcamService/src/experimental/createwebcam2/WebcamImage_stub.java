//This file is automatically generated. DO NOT EDIT!
package experimental.createwebcam2;
import java.util.*;
import com.robotraconteur.*;
public class WebcamImage_stub implements IStructureStub {
    public WebcamImage_stub(experimental__createwebcam2Factory d) {def=d;}
    private experimental__createwebcam2Factory def;
    public MessageElementStructure packStructure(Object s1) {
    vectorptr_messageelement m=new vectorptr_messageelement();
    try {
    if (s1 ==null) return null;
    WebcamImage s = (WebcamImage)s1;
    MessageElementUtil.addMessageElementDispose(m,MessageElementUtil.<int[]>packArray("width",new int[] {s.width}));
    MessageElementUtil.addMessageElementDispose(m,MessageElementUtil.<int[]>packArray("height",new int[] {s.height}));
    MessageElementUtil.addMessageElementDispose(m,MessageElementUtil.<int[]>packArray("step",new int[] {s.step}));
    MessageElementUtil.addMessageElementDispose(m,MessageElementUtil.<UnsignedBytes>packArray("data",s.data));
    return new MessageElementStructure("experimental.createwebcam2.WebcamImage",m);
    }
    finally {
    m.delete();
    }
    }
    public <T> T unpackStructure(MessageElementData m) {
    if (m == null ) return null;
    MessageElementStructure m2 = (MessageElementStructure)m;
    vectorptr_messageelement mm=m2.getElements();
    try {
    WebcamImage s=new WebcamImage();
    s.width =(MessageElementUtil.<int[]>castDataAndDispose(MessageElement.findElement(mm,"width")))[0];
    s.height =(MessageElementUtil.<int[]>castDataAndDispose(MessageElement.findElement(mm,"height")))[0];
    s.step =(MessageElementUtil.<int[]>castDataAndDispose(MessageElement.findElement(mm,"step")))[0];
    s.data =MessageElementUtil.<UnsignedBytes>unpackArray(MessageElement.findElement(mm,"data"));
    T st; try {st=(T)s;} catch (Exception e) {throw new RuntimeException(new DataTypeMismatchException("Wrong structuretype"));}
    return st;
    }
    finally {
    if (mm!=null) mm.delete();
    }
    }
}