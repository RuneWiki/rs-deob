package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("av")
public class class42 extends class53 {

    @ObfuscatedName("av.f")
    public AudioFormat field286;

    @ObfuscatedName("av.o")
    public SourceDataLine field287;

    @ObfuscatedName("av.u")
    public int field288;

    @ObfuscatedName("av.p")
    public byte[] field289;

    @ObfuscatedName("av.f(I)V")
    public void method324() {
        this.field286 = new AudioFormat((float) Statics.field395, 16, Statics.field388 ? 2 : 1, true, false);
        this.field289 = new byte[0x100 << (Statics.field388 ? 2 : 1)];
    }

    @ObfuscatedName("av.o(II)V")
    public void method309(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field286, arg0 << (Statics.field388 ? 2 : 1));
            this.field287 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field287.open();
            this.field287.start();
            this.field288 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field287 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method309(var17);
        }
    }

    @ObfuscatedName("av.u(I)I")
    public int method310() {
        return this.field288 - (this.field287.available() >> (Statics.field388 ? 2 : 1));
    }

    @ObfuscatedName("av.p()V")
    public void method311() {
        int var1 = 256;
        if (Statics.field388) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field408[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field289[var2 * 2] = (byte) (var3 >> 8);
            this.field289[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field287.write(this.field289, 0, var1 << 1);
    }

    @ObfuscatedName("av.b(B)V")
    public void method312() {
        if (this.field287 != null) {
            this.field287.close();
            this.field287 = null;
        }
    }

    @ObfuscatedName("av.e(B)V")
    public void method313() {
        this.field287.flush();
    }
}
