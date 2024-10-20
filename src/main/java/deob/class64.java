package deob;

import java.util.zip.Inflater;

@ObfuscatedName("bx")
public class class64 {

    @ObfuscatedName("bx.t")
    public Inflater field809;

    public class64() {
        this(-1, 1000000, 1000000);
    }

    public class64(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("bx.t(Lec;[BB)V")
    public void method783(class135 arg0, byte[] arg1) {
        if (arg0.field1723[arg0.field1722] != 31 || arg0.field1723[arg0.field1722 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field809 == null) {
            this.field809 = new Inflater(true);
        }
        try {
            this.field809.setInput(arg0.field1723, arg0.field1722 + 10, arg0.field1723.length - (arg0.field1722 + 10 + 8));
            this.field809.inflate(arg1);
        } catch (Exception var4) {
            this.field809.reset();
            throw new RuntimeException("");
        }
        this.field809.reset();
    }
}
