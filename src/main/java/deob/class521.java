package deob;

import java.util.zip.Inflater;

@ObfuscatedName("uh")
public class class521 {

    @ObfuscatedName("uh.at")
    public Inflater field5158;

    public class521() {
        this(-1, 1000000, 1000000);
    }

    public class521(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("uh.at(Ltz;[BI)V")
    public void method8748(class501 arg0, byte[] arg1) {
        if (arg0.field5016[arg0.field5017] != 31 || arg0.field5016[arg0.field5017 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5158 == null) {
            this.field5158 = new Inflater(true);
        }
        try {
            this.field5158.setInput(arg0.field5016, arg0.field5017 + 10, arg0.field5016.length - (arg0.field5017 + 10 + 8));
            this.field5158.inflate(arg1);
        } catch (Exception var4) {
            this.field5158.reset();
            throw new RuntimeException("");
        }
        this.field5158.reset();
    }
}
