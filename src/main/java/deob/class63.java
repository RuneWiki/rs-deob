package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bs")
public class class63 extends class50 {

    @ObfuscatedName("bs.k")
    public AudioFormat field1165;

    @ObfuscatedName("bs.y")
    public SourceDataLine field1163;

    @ObfuscatedName("bs.aw")
    public int field1164;

    @ObfuscatedName("bs.ar")
    public byte[] field1162;

    @ObfuscatedName("bs.k(Ljava/awt/Component;)V")
    public void method923(Component arg0) {
        this.field1165 = new AudioFormat((float) Statics.field1074, 16, Statics.field1053 ? 2 : 1, true, false);
        this.field1162 = new byte[0x100 << (Statics.field1053 ? 2 : 1)];
    }

    @ObfuscatedName("bs.y(I)V")
    public void method933(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1165, arg0 << (Statics.field1053 ? 2 : 1));
            this.field1163 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1163.open();
            this.field1163.start();
            this.field1164 = arg0;
        } catch (LineUnavailableException var11) {
            if (class113.method657(arg0) == 1) {
                this.field1163 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method933(var10);
        }
    }

    @ObfuscatedName("bs.s()I")
    public int method925() {
        return this.field1164 - (this.field1163.available() >> (Statics.field1053 ? 2 : 1));
    }

    @ObfuscatedName("bs.g()V")
    public void method937() {
        int var1 = 256;
        if (Statics.field1053) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1054[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1162[var2 * 2] = (byte) (var3 >> 8);
            this.field1162[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1163.write(this.field1162, 0, var1 << 1);
    }

    @ObfuscatedName("bs.h()V")
    public void method941() {
        if (this.field1163 != null) {
            this.field1163.close();
            this.field1163 = null;
        }
    }

    @ObfuscatedName("bs.l()V")
    public void method928() {
        this.field1163.flush();
    }
}
