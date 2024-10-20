package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bs")
public class class70 extends class57 {

    @ObfuscatedName("bs.j")
    public AudioFormat field1272;

    @ObfuscatedName("bs.m")
    public SourceDataLine field1274;

    @ObfuscatedName("bs.ae")
    public int field1273;

    @ObfuscatedName("bs.ai")
    public byte[] field1275;

    @ObfuscatedName("bs.j(Ljava/awt/Component;)V")
    public void method1118(Component arg0) {
        this.field1272 = new AudioFormat((float) Statics.field1184, 16, Statics.field3216 ? 2 : 1, true, false);
        this.field1275 = new byte[0x100 << (Statics.field3216 ? 2 : 1)];
    }

    @ObfuscatedName("bs.m(I)V")
    public void method1119(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1272, arg0 << (Statics.field3216 ? 2 : 1));
            this.field1274 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1274.open();
            this.field1274.start();
            this.field1273 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1274 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1119(var17);
        }
    }

    @ObfuscatedName("bs.f()I")
    public int method1120() {
        return this.field1273 - (this.field1274.available() >> (Statics.field3216 ? 2 : 1));
    }

    @ObfuscatedName("bs.l()V")
    public void method1125() {
        int var1 = 256;
        if (Statics.field3216) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1166[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1275[var2 * 2] = (byte) (var3 >> 8);
            this.field1275[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1274.write(this.field1275, 0, var1 << 1);
    }

    @ObfuscatedName("bs.u()V")
    public void method1122() {
        if (this.field1274 != null) {
            this.field1274.close();
            this.field1274 = null;
        }
    }

    @ObfuscatedName("bs.a()V")
    public void method1139() {
        this.field1274.flush();
    }
}
