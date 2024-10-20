package deob;

import java.util.zip.Inflater;

@ObfuscatedName("gq")
public class class188 {

    @ObfuscatedName("gq.g")
    public Inflater field2504;

    public class188() {
        this(-1, 1000000, 1000000);
    }

    public class188(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gq.g(Lgg;[BB)V")
    public void method3243(class195 arg0, byte[] arg1) {
        if (arg0.field2563[arg0.field2562] != 31 || arg0.field2563[arg0.field2562 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2504 == null) {
            this.field2504 = new Inflater(true);
        }
        try {
            this.field2504.setInput(arg0.field2563, arg0.field2562 + 10, arg0.field2563.length - (arg0.field2562 + 10 + 8));
            this.field2504.inflate(arg1);
        } catch (Exception var4) {
            this.field2504.reset();
            throw new RuntimeException("");
        }
        this.field2504.reset();
    }
}
