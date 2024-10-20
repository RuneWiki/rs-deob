package deob;

import java.util.zip.Inflater;

@ObfuscatedName("dh")
public class class42 {

    @ObfuscatedName("dh.j")
    public Inflater field347;

    @ObfuscatedName("dh.j(Ldy;[BI)V")
    public void method717(class31 arg0, byte[] arg1) {
        if (arg0.field168[arg0.field172] != 31 || arg0.field168[arg0.field172 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field347 == null) {
            this.field347 = new Inflater(true);
        }
        try {
            this.field347.setInput(arg0.field168, arg0.field172 + 10, arg0.field168.length - (arg0.field172 + 10 + 8));
            this.field347.inflate(arg1);
        } catch (Exception var4) {
            this.field347.reset();
            throw new RuntimeException("");
        }
        this.field347.reset();
    }

    public class42(int arg0, int arg1, int arg2) {
    }

    public class42() {
        this(-1, 1000000, 1000000);
    }
}
