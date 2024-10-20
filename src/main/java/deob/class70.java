package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bs")
public class class70 extends class57 {

    @ObfuscatedName("bs.z")
    public AudioFormat field1280;

    @ObfuscatedName("bs.q")
    public SourceDataLine field1281;

    @ObfuscatedName("bs.al")
    public int field1282;

    @ObfuscatedName("bs.ay")
    public byte[] field1283;

    @ObfuscatedName("bs.z(Ljava/awt/Component;)V")
    public void method1072(Component arg0) {
        this.field1280 = new AudioFormat((float) Statics.field1194, 16, Statics.field1173 ? 2 : 1, true, false);
        this.field1283 = new byte[0x100 << (Statics.field1173 ? 2 : 1)];
    }

    @ObfuscatedName("bs.q(I)V")
    public void method1071(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1280, arg0 << (Statics.field1173 ? 2 : 1));
            this.field1281 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1281.open();
            this.field1281.start();
            this.field1282 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1281 = null;
                throw var11;
            } else {
                this.method1071(class126.method1991(arg0));
            }
        }
    }

    @ObfuscatedName("bs.k()I")
    public int method1091() {
        return this.field1282 - (this.field1281.available() >> (Statics.field1173 ? 2 : 1));
    }

    @ObfuscatedName("bs.f()V")
    public void method1087() {
        int var1 = 256;
        if (Statics.field1173) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1182[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1283[var2 * 2] = (byte) (var3 >> 8);
            this.field1283[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1281.write(this.field1283, 0, var1 << 1);
    }

    @ObfuscatedName("bs.d()V")
    public void method1074() {
        if (this.field1281 != null) {
            this.field1281.close();
            this.field1281 = null;
        }
    }

    @ObfuscatedName("bs.l()V")
    public void method1076() {
        this.field1281.flush();
    }
}
