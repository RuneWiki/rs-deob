package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ff")
public class class170 {

    @ObfuscatedName("ff.s")
    public Inflater field2339;

    public class170() {
        this(-1, 1000000, 1000000);
    }

    public class170(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ff.s(Lfs;[BI)V")
    public void method2903(class177 arg0, byte[] arg1) {
        if (arg0.field2403[arg0.field2402] != 31 || arg0.field2403[arg0.field2402 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2339 == null) {
            this.field2339 = new Inflater(true);
        }
        try {
            this.field2339.setInput(arg0.field2403, arg0.field2402 + 10, arg0.field2403.length - (arg0.field2402 + 10 + 8));
            this.field2339.inflate(arg1);
        } catch (Exception var4) {
            this.field2339.reset();
            throw new RuntimeException("");
        }
        this.field2339.reset();
    }
}
