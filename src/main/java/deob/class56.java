package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bo")
public class class56 extends class110 {

    @ObfuscatedName("bo.i")
    public AudioFormat field682;

    @ObfuscatedName("bo.c")
    public SourceDataLine field683;

    @ObfuscatedName("bo.e")
    public int field684;

    @ObfuscatedName("bo.v")
    public byte[] field685;

    @ObfuscatedName("bo.i(I)V")
    public void method675() {
        this.field682 = new AudioFormat((float) Statics.field1641, 16, Statics.field3733 ? 2 : 1, true, false);
        this.field685 = new byte[0x100 << (Statics.field3733 ? 2 : 1)];
    }

    @ObfuscatedName("bo.c(II)V")
    public void method673(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field682, arg0 << (Statics.field3733 ? 2 : 1));
            this.field683 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field683.open();
            this.field683.start();
            this.field684 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field683 = null;
                throw var11;
            } else {
                this.method673(class178.method219(arg0));
            }
        }
    }

    @ObfuscatedName("bo.e(I)I")
    public int method680() {
        return this.field684 - (this.field683.available() >> (Statics.field3733 ? 2 : 1));
    }

    @ObfuscatedName("bo.v()V")
    public void method671() {
        int var1 = 256;
        if (Statics.field3733) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1642[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field685[var2 * 2] = (byte) (var3 >> 8);
            this.field685[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field683.write(this.field685, 0, var1 << 1);
    }

    @ObfuscatedName("bo.b(I)V")
    public void method676() {
        if (this.field683 != null) {
            this.field683.close();
            this.field683 = null;
        }
    }

    @ObfuscatedName("bo.y(B)V")
    public void method687() {
        this.field683.flush();
    }
}
