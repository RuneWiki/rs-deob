package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ad")
public class class51 extends class52 {

    @ObfuscatedName("ad.b")
    public AudioFormat field1073;

    @ObfuscatedName("ad.e")
    public SourceDataLine field1074;

    @ObfuscatedName("ad.g")
    public int field1075;

    @ObfuscatedName("ad.o")
    public byte[] field1076;

    @ObfuscatedName("ad.b(Ljava/awt/Component;)V")
    public void method915(Component arg0) {
        this.field1073 = new AudioFormat((float) Statics.field1093, 16, Statics.field1078 ? 2 : 1, true, false);
        this.field1076 = new byte[0x100 << (Statics.field1078 ? 2 : 1)];
    }

    @ObfuscatedName("ad.e(I)V")
    public void method900(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1073, arg0 << (Statics.field1078 ? 2 : 1));
            this.field1074 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1074.open();
            this.field1074.start();
            this.field1075 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1074 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method900(var17);
        }
    }

    @ObfuscatedName("ad.g()I")
    public int method901() {
        return this.field1075 - (this.field1074.available() >> (Statics.field1078 ? 2 : 1));
    }

    @ObfuscatedName("ad.o()V")
    public void method902() {
        int var1 = 256;
        if (Statics.field1078) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1081[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1076[var2 * 2] = (byte) (var3 >> 8);
            this.field1076[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1074.write(this.field1076, 0, var1 << 1);
    }

    @ObfuscatedName("ad.a()V")
    public void method904() {
        if (this.field1074 != null) {
            this.field1074.close();
            this.field1074 = null;
        }
    }

    @ObfuscatedName("ad.h()V")
    public void method912() {
        this.field1074.flush();
    }
}
