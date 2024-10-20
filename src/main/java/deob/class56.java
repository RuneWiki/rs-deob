package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class56 extends class107 {

    @ObfuscatedName("bq.p")
    public AudioFormat field613;

    @ObfuscatedName("bq.i")
    public SourceDataLine field611;

    @ObfuscatedName("bq.w")
    public int field614;

    @ObfuscatedName("bq.s")
    public byte[] field612;

    @ObfuscatedName("bq.p(I)V")
    public void method700() {
        this.field613 = new AudioFormat((float) Statics.field311, 16, Statics.field257 ? 2 : 1, true, false);
        this.field612 = new byte[0x100 << (Statics.field257 ? 2 : 1)];
    }

    @ObfuscatedName("bq.i(II)V")
    public void method688(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field613, arg0 << (Statics.field257 ? 2 : 1));
            this.field611 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field611.open();
            this.field611.start();
            this.field614 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field611 = null;
                throw var11;
            } else {
                this.method688(class189.method2865(arg0));
            }
        }
    }

    @ObfuscatedName("bq.w(I)I")
    public int method686() {
        return this.field614 - (this.field611.available() >> (Statics.field257 ? 2 : 1));
    }

    @ObfuscatedName("bq.s()V")
    public void method697() {
        int var1 = 256;
        if (Statics.field257) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1523[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field612[var2 * 2] = (byte) (var3 >> 8);
            this.field612[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field611.write(this.field612, 0, var1 << 1);
    }

    @ObfuscatedName("bq.j(I)V")
    public void method691() {
        if (this.field611 != null) {
            this.field611.close();
            this.field611 = null;
        }
    }

    @ObfuscatedName("bq.a(I)V")
    public void method692() {
        this.field611.flush();
    }
}
