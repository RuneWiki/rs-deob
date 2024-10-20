package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bf")
public class class56 extends class110 {

    @ObfuscatedName("bf.s")
    public AudioFormat field673;

    @ObfuscatedName("bf.c")
    public SourceDataLine field671;

    @ObfuscatedName("bf.f")
    public int field672;

    @ObfuscatedName("bf.m")
    public byte[] field670;

    @ObfuscatedName("bf.s(I)V")
    public void method684() {
        this.field673 = new AudioFormat((float) Statics.field1634, 16, Statics.field1627 ? 2 : 1, true, false);
        this.field670 = new byte[0x100 << (Statics.field1627 ? 2 : 1)];
    }

    @ObfuscatedName("bf.c(II)V")
    public void method685(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field673, arg0 << (Statics.field1627 ? 2 : 1));
            this.field671 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field671.open();
            this.field671.start();
            this.field672 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field671 = null;
                throw var11;
            } else {
                this.method685(class181.method3979(arg0));
            }
        }
    }

    @ObfuscatedName("bf.f(B)I")
    public int method687() {
        return this.field672 - (this.field671.available() >> (Statics.field1627 ? 2 : 1));
    }

    @ObfuscatedName("bf.m()V")
    public void method697() {
        int var1 = 256;
        if (Statics.field1627) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1641[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field670[var2 * 2] = (byte) (var3 >> 8);
            this.field670[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field671.write(this.field670, 0, var1 << 1);
    }

    @ObfuscatedName("bf.h(B)V")
    public void method702() {
        if (this.field671 != null) {
            this.field671.close();
            this.field671 = null;
        }
    }

    @ObfuscatedName("bf.t(B)V")
    public void method689() {
        this.field671.flush();
    }
}
