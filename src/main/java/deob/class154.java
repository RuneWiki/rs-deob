package deob;

import java.util.zip.Inflater;

@ObfuscatedName("em")
public class class154 {

    @ObfuscatedName("em.n")
    public Inflater field2223;

    public class154() {
        this(-1, 1000000, 1000000);
    }

    public class154(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("em.n(Lfa;[BI)V")
    public void method2715(class161 arg0, byte[] arg1) {
        if (arg0.field2291[arg0.field2285] != 31 || arg0.field2291[arg0.field2285 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2223 == null) {
            this.field2223 = new Inflater(true);
        }
        try {
            this.field2223.setInput(arg0.field2291, arg0.field2285 + 10, arg0.field2291.length - (arg0.field2285 + 10 + 8));
            this.field2223.inflate(arg1);
        } catch (Exception var4) {
            this.field2223.reset();
            throw new RuntimeException("");
        }
        this.field2223.reset();
    }
}
