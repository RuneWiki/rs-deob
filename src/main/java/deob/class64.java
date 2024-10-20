package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bj")
public class class64 extends class51 {

    @ObfuscatedName("bj.p")
    public AudioFormat field1180;

    @ObfuscatedName("bj.y")
    public SourceDataLine field1179;

    @ObfuscatedName("bj.af")
    public int field1181;

    @ObfuscatedName("bj.ax")
    public byte[] field1178;

    @ObfuscatedName("bj.p(Ljava/awt/Component;)V")
    public void method956(Component arg0) {
        this.field1180 = new AudioFormat((float) Statics.field1071, 16, Statics.field1067 ? 2 : 1, true, false);
        this.field1178 = new byte[0x100 << (Statics.field1067 ? 2 : 1)];
    }

    @ObfuscatedName("bj.y(I)V")
    public void method957(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1180, arg0 << (Statics.field1067 ? 2 : 1));
            this.field1179 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1179.open();
            this.field1179.start();
            this.field1181 = arg0;
        } catch (LineUnavailableException var4) {
            if (class117.method140(arg0) == 1) {
                this.field1179 = null;
                throw var4;
            } else {
                this.method957(class117.method709(arg0));
            }
        }
    }

    @ObfuscatedName("bj.d()I")
    public int method973() {
        return this.field1181 - (this.field1179.available() >> (Statics.field1067 ? 2 : 1));
    }

    @ObfuscatedName("bj.c()V")
    public void method958() {
        int var1 = 256;
        if (Statics.field1067) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1065[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1178[var2 * 2] = (byte) (var3 >> 8);
            this.field1178[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1179.write(this.field1178, 0, var1 << 1);
    }

    @ObfuscatedName("bj.r()V")
    public void method959() {
        if (this.field1179 != null) {
            this.field1179.close();
            this.field1179 = null;
        }
    }

    @ObfuscatedName("bj.f()V")
    public void method960() {
        this.field1179.flush();
    }
}
