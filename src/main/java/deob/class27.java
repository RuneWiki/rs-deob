package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ag")
public class class27 extends class40 {

    @ObfuscatedName("ag.o")
    public AudioFormat field162;

    @ObfuscatedName("ag.q")
    public SourceDataLine field160;

    @ObfuscatedName("ag.l")
    public int field159;

    @ObfuscatedName("ag.k")
    public byte[] field161;

    @ObfuscatedName("ag.o(I)V")
    public void method342() {
        this.field162 = new AudioFormat((float) Statics.field301, 16, Statics.field3995 ? 2 : 1, true, false);
        this.field161 = new byte[0x100 << (Statics.field3995 ? 2 : 1)];
    }

    @ObfuscatedName("ag.q(IS)V")
    public void method343(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field162, arg0 << (Statics.field3995 ? 2 : 1));
            this.field160 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field160.open();
            this.field160.start();
            this.field159 = arg0;
        } catch (LineUnavailableException var4) {
            if (class272.method3035(arg0) == 1) {
                this.field160 = null;
                throw var4;
            } else {
                this.method343(class272.method6642(arg0));
            }
        }
    }

    @ObfuscatedName("ag.l(S)I")
    public int method344() {
        return this.field159 - (this.field160.available() >> (Statics.field3995 ? 2 : 1));
    }

    @ObfuscatedName("ag.k()V")
    public void method345() {
        int var1 = 256;
        if (Statics.field3995) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field292[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field161[var2 * 2] = (byte) (var3 >> 8);
            this.field161[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field160.write(this.field161, 0, var1 << 1);
    }

    @ObfuscatedName("ag.a(B)V")
    public void method346() {
        if (this.field160 != null) {
            this.field160.close();
            this.field160 = null;
        }
    }

    @ObfuscatedName("ag.m(I)V")
    public void method354() {
        this.field160.flush();
    }
}
