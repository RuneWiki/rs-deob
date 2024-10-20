package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ap")
public class class50 extends class103 {

    @ObfuscatedName("ap.n")
    public AudioFormat field415;

    @ObfuscatedName("ap.h")
    public SourceDataLine field414;

    @ObfuscatedName("ap.l")
    public int field413;

    @ObfuscatedName("ap.g")
    public byte[] field416;

    @ObfuscatedName("ap.n(B)V")
    public void method710() {
        this.field415 = new AudioFormat((float) Statics.field1374, 16, Statics.field1355 ? 2 : 1, true, false);
        this.field416 = new byte[0x100 << (Statics.field1355 ? 2 : 1)];
    }

    @ObfuscatedName("ap.h(II)V")
    public void method711(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field415, arg0 << (Statics.field1355 ? 2 : 1));
            this.field414 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field414.open();
            this.field414.start();
            this.field413 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field414 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method711(var17);
        }
    }

    @ObfuscatedName("ap.l(I)I")
    public int method712() {
        return this.field413 - (this.field414.available() >> (Statics.field1355 ? 2 : 1));
    }

    @ObfuscatedName("ap.g()V")
    public void method713() {
        int var1 = 256;
        if (Statics.field1355) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1369[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field416[var2 * 2] = (byte) (var3 >> 8);
            this.field416[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field414.write(this.field416, 0, var1 << 1);
    }

    @ObfuscatedName("ap.b(B)V")
    public void method714() {
        if (this.field414 != null) {
            this.field414.close();
            this.field414 = null;
        }
    }

    @ObfuscatedName("ap.a(B)V")
    public void method715() {
        this.field414.flush();
    }
}
