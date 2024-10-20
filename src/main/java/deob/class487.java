package deob;

import java.util.zip.Inflater;

@ObfuscatedName("rr")
public class class487 {

    @ObfuscatedName("rr.h")
    public Inflater field5055;

    public class487() {
        this(-1, 1000000, 1000000);
    }

    public class487(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("rr.h(Lqy;[BI)V")
    public void method8378(class467 arg0, byte[] arg1) {
        if (arg0.field4917[arg0.field4915] != 31 || arg0.field4917[arg0.field4915 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5055 == null) {
            this.field5055 = new Inflater(true);
        }
        try {
            this.field5055.setInput(arg0.field4917, arg0.field4915 + 10, arg0.field4917.length - (arg0.field4915 + 10 + 8));
            this.field5055.inflate(arg1);
        } catch (Exception var4) {
            this.field5055.reset();
            throw new RuntimeException("");
        }
        this.field5055.reset();
    }
}
