package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bc")
public class class56 extends class109 {

    @ObfuscatedName("bc.i")
    public AudioFormat field691;

    @ObfuscatedName("bc.j")
    public SourceDataLine field689;

    @ObfuscatedName("bc.a")
    public int field688;

    @ObfuscatedName("bc.r")
    public byte[] field690;

    @ObfuscatedName("bc.i(I)V")
    public void method738() {
        this.field691 = new AudioFormat((float) Statics.field899, 16, Statics.field1644 ? 2 : 1, true, false);
        this.field690 = new byte[0x100 << (Statics.field1644 ? 2 : 1)];
    }

    @ObfuscatedName("bc.j(II)V")
    public void method724(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field691, arg0 << (Statics.field1644 ? 2 : 1));
            this.field689 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field689.open();
            this.field689.start();
            this.field688 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field689 = null;
                throw var11;
            } else {
                this.method724(class179.method2906(arg0));
            }
        }
    }

    @ObfuscatedName("bc.a(I)I")
    public int method725() {
        return this.field688 - (this.field689.available() >> (Statics.field1644 ? 2 : 1));
    }

    @ObfuscatedName("bc.r()V")
    public void method722() {
        int var1 = 256;
        if (Statics.field1644) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1647[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field690[var2 * 2] = (byte) (var3 >> 8);
            this.field690[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field689.write(this.field690, 0, var1 << 1);
    }

    @ObfuscatedName("bc.o(I)V")
    public void method727() {
        if (this.field689 != null) {
            this.field689.close();
            this.field689 = null;
        }
    }

    @ObfuscatedName("bc.n(I)V")
    public void method736() {
        this.field689.flush();
    }
}
