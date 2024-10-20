package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ai")
public class class25 extends class43 {

    @ObfuscatedName("ai.aw")
    public AudioFormat field129;

    @ObfuscatedName("ai.ay")
    public SourceDataLine field130;

    @ObfuscatedName("ai.ar")
    public int field131;

    @ObfuscatedName("ai.am")
    public byte[] field132;

    @ObfuscatedName("ai.aw(S)V")
    public void method318() {
        this.field129 = new AudioFormat((float) Statics.field315, 16, Statics.field4376 ? 2 : 1, true, false);
        this.field132 = new byte[0x100 << (Statics.field4376 ? 2 : 1)];
    }

    @ObfuscatedName("ai.ay(II)V")
    public void method334(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field129, arg0 << (Statics.field4376 ? 2 : 1));
            this.field130 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field130.open();
            this.field130.start();
            this.field131 = arg0;
        } catch (LineUnavailableException var4) {
            if (class305.method2197(arg0) == 1) {
                this.field130 = null;
                throw var4;
            } else {
                this.method334(class305.method2707(arg0));
            }
        }
    }

    @ObfuscatedName("ai.ar(B)I")
    public int method317() {
        return this.field131 - (this.field130.available() >> (Statics.field4376 ? 2 : 1));
    }

    @ObfuscatedName("ai.am()V")
    public void method322() {
        int var1 = 256;
        if (Statics.field4376) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field304[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field132[var2 * 2] = (byte) (var3 >> 8);
            this.field132[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field130.write(this.field132, 0, var1 << 1);
    }

    @ObfuscatedName("ai.as(I)V")
    public void method325() {
        if (this.field130 != null) {
            this.field130.close();
            this.field130 = null;
        }
    }

    @ObfuscatedName("ai.aj(I)V")
    public void method323() {
        this.field130.flush();
    }
}
