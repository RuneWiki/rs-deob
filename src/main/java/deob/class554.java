package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vo")
public class class554 {

    @ObfuscatedName("vo.aq")
    public Inflater field5345;

    public class554() {
        this(-1, 1000000, 1000000);
    }

    public class554(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vo.aq(Luq;[BI)V")
    public void method9172(class534 arg0, byte[] arg1) {
        if (arg0.field5199[arg0.field5200] != 31 || arg0.field5199[arg0.field5200 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5345 == null) {
            this.field5345 = new Inflater(true);
        }
        try {
            this.field5345.setInput(arg0.field5199, arg0.field5200 + 10, arg0.field5199.length - (arg0.field5200 + 10 + 8));
            this.field5345.inflate(arg1);
        } catch (Exception var4) {
            this.field5345.reset();
            throw new RuntimeException("");
        }
        this.field5345.reset();
    }
}
