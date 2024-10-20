package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ac")
public class class42 extends class53 {

    @ObfuscatedName("ac.f")
    public AudioFormat field305;

    @ObfuscatedName("ac.e")
    public SourceDataLine field302;

    @ObfuscatedName("ac.v")
    public int field304;

    @ObfuscatedName("ac.y")
    public byte[] field303;

    @ObfuscatedName("ac.f(B)V")
    public void method348() {
        this.field305 = new AudioFormat((float) Statics.field3922, 16, Statics.field411 ? 2 : 1, true, false);
        this.field303 = new byte[0x100 << (Statics.field411 ? 2 : 1)];
    }

    @ObfuscatedName("ac.e(II)V")
    public void method338(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field305, arg0 << (Statics.field411 ? 2 : 1));
            this.field302 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field302.open();
            this.field302.start();
            this.field304 = arg0;
        } catch (LineUnavailableException var4) {
            if (class232.method4439(arg0) == 1) {
                this.field302 = null;
                throw var4;
            } else {
                this.method338(class232.method2226(arg0));
            }
        }
    }

    @ObfuscatedName("ac.v(B)I")
    public int method336() {
        return this.field304 - (this.field302.available() >> (Statics.field411 ? 2 : 1));
    }

    @ObfuscatedName("ac.y()V")
    public void method354() {
        int var1 = 256;
        if (Statics.field411) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field419[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field303[var2 * 2] = (byte) (var3 >> 8);
            this.field303[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field302.write(this.field303, 0, var1 << 1);
    }

    @ObfuscatedName("ac.j(I)V")
    public void method356() {
        if (this.field302 != null) {
            this.field302.close();
            this.field302 = null;
        }
    }

    @ObfuscatedName("ac.o(I)V")
    public void method342() {
        this.field302.flush();
    }
}
