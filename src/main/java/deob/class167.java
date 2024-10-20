package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fg")
public class class167 {

    @ObfuscatedName("fg.n")
    public Inflater field2337;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fg.n(Lfl;[BI)V")
    public void method2842(class174 arg0, byte[] arg1) {
        if (arg0.field2401[arg0.field2400] != 31 || arg0.field2401[arg0.field2400 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2337 == null) {
            this.field2337 = new Inflater(true);
        }
        try {
            this.field2337.setInput(arg0.field2401, arg0.field2400 + 10, arg0.field2401.length - (arg0.field2400 + 10 + 8));
            this.field2337.inflate(arg1);
        } catch (Exception var4) {
            this.field2337.reset();
            throw new RuntimeException("");
        }
        this.field2337.reset();
    }
}
