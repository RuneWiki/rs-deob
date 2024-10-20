package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fj")
public class class167 {

    @ObfuscatedName("fj.i")
    public Inflater field2337;

    public class167() {
        this(-1, 1000000, 1000000);
    }

    public class167(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fj.i(Lfp;[BI)V")
    public void method2806(class174 arg0, byte[] arg1) {
        if (arg0.field2405[arg0.field2399] != 31 || arg0.field2405[arg0.field2399 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2337 == null) {
            this.field2337 = new Inflater(true);
        }
        try {
            this.field2337.setInput(arg0.field2405, arg0.field2399 + 10, arg0.field2405.length - (arg0.field2399 + 10 + 8));
            this.field2337.inflate(arg1);
        } catch (Exception var4) {
            this.field2337.reset();
            throw new RuntimeException("");
        }
        this.field2337.reset();
    }
}
