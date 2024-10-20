package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fl")
public class class176 {

    @ObfuscatedName("fl.w")
    public Inflater field2303;

    public class176() {
        this(-1, 1000000, 1000000);
    }

    public class176(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fl.w(Lgy;[BI)V")
    public void method3193(class183 arg0, byte[] arg1) {
        if (arg0.field2366[arg0.field2360] != 31 || arg0.field2366[arg0.field2360 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field2303 == null) {
            this.field2303 = new Inflater(true);
        }
        try {
            this.field2303.setInput(arg0.field2366, arg0.field2360 + 10, arg0.field2366.length - (arg0.field2360 + 10 + 8));
            this.field2303.inflate(arg1);
        } catch (Exception var4) {
            this.field2303.reset();
            throw new RuntimeException("");
        }
        this.field2303.reset();
    }
}
