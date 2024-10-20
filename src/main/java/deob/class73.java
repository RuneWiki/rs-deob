package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bg")
public class class73 extends class60 {

    @ObfuscatedName("bg.as")
    public AudioFormat field1358;

    @ObfuscatedName("bg.ac")
    public SourceDataLine field1356;

    @ObfuscatedName("bg.ah")
    public int field1357;

    @ObfuscatedName("bg.am")
    public byte[] field1355;

    @ObfuscatedName("bg.m(Ljava/awt/Component;I)V")
    public void method1311(Component arg0) {
        this.field1358 = new AudioFormat((float) Statics.field1255, 16, Statics.field1265 ? 2 : 1, true, false);
        this.field1355 = new byte[0x100 << (Statics.field1265 ? 2 : 1)];
    }

    @ObfuscatedName("bg.q(II)V")
    public void method1277(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1358, arg0 << (Statics.field1265 ? 2 : 1));
            this.field1356 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1356.open();
            this.field1356.start();
            this.field1357 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1356 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1277(var17);
        }
    }

    @ObfuscatedName("bg.p(I)I")
    public int method1316() {
        return this.field1357 - (this.field1356.available() >> (Statics.field1265 ? 2 : 1));
    }

    @ObfuscatedName("bg.w()V")
    public void method1279() {
        int var1 = 256;
        if (Statics.field1265) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1249[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1355[var2 * 2] = (byte) (var3 >> 8);
            this.field1355[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1356.write(this.field1355, 0, var1 << 1);
    }

    @ObfuscatedName("bg.o(B)V")
    public void method1280() {
        if (this.field1356 != null) {
            this.field1356.close();
            this.field1356 = null;
        }
    }

    @ObfuscatedName("bg.d(I)V")
    public void method1276() {
        this.field1356.flush();
    }
}
