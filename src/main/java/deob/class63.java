package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bm")
public class class63 extends class50 {

    @ObfuscatedName("bm.e")
    public AudioFormat field1178;

    @ObfuscatedName("bm.p")
    public SourceDataLine field1177;

    @ObfuscatedName("bm.aq")
    public int field1179;

    @ObfuscatedName("bm.ai")
    public byte[] field1176;

    @ObfuscatedName("bm.e(Ljava/awt/Component;)V")
    public void method962(Component arg0) {
        this.field1178 = new AudioFormat((float) Statics.field1076, 16, Statics.field1066 ? 2 : 1, true, false);
        this.field1176 = new byte[0x100 << (Statics.field1066 ? 2 : 1)];
    }

    @ObfuscatedName("bm.p(I)V")
    public void method959(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1178, arg0 << (Statics.field1066 ? 2 : 1));
            this.field1177 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1177.open();
            this.field1177.start();
            this.field1179 = arg0;
        } catch (LineUnavailableException var4) {
            if (class113.method1969(arg0) == 1) {
                this.field1177 = null;
                throw var4;
            } else {
                this.method959(class113.method2393(arg0));
            }
        }
    }

    @ObfuscatedName("bm.a()I")
    public int method960() {
        return this.field1179 - (this.field1177.available() >> (Statics.field1066 ? 2 : 1));
    }

    @ObfuscatedName("bm.g()V")
    public void method961() {
        int var1 = 256;
        if (Statics.field1066) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1068[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1176[var2 * 2] = (byte) (var3 >> 8);
            this.field1176[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1177.write(this.field1176, 0, var1 << 1);
    }

    @ObfuscatedName("bm.u()V")
    public void method967() {
        if (this.field1177 != null) {
            this.field1177.close();
            this.field1177 = null;
        }
    }

    @ObfuscatedName("bm.k()V")
    public void method963() {
        this.field1177.flush();
    }
}
