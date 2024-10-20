package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fv")
public class class176 {

    @ObfuscatedName("fv.z")
    public Inflater field2269;

    public class176() {
        this(-1, 1000000, 1000000);
    }

    public class176(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fv.z(Lgk;[BI)V")
    public void method3186(class183 arg0, byte[] arg1) {
        if (arg0.field2339[arg0.field2340] != 31 || arg0.field2339[arg0.field2340 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2269 == null) {
            this.field2269 = new Inflater(true);
        }
        try {
            this.field2269.setInput(arg0.field2339, arg0.field2340 + 10, arg0.field2339.length - (arg0.field2340 + 10 + 8));
            this.field2269.inflate(arg1);
        } catch (Exception var4) {
            this.field2269.reset();
            throw new RuntimeException("");
        }
        this.field2269.reset();
    }
}
