package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bw")
public class class56 extends class108 {

    @ObfuscatedName("bw.w")
    public AudioFormat field688;

    @ObfuscatedName("bw.s")
    public SourceDataLine field690;

    @ObfuscatedName("bw.q")
    public int field689;

    @ObfuscatedName("bw.o")
    public byte[] field691;

    @ObfuscatedName("bw.w(B)V")
    public void method695() {
        this.field688 = new AudioFormat((float) Statics.field1621, 16, Statics.field1618 ? 2 : 1, true, false);
        this.field691 = new byte[0x100 << (Statics.field1618 ? 2 : 1)];
    }

    @ObfuscatedName("bw.s(IB)V")
    public void method696(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field688, arg0 << (Statics.field1618 ? 2 : 1));
            this.field690 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field690.open();
            this.field690.start();
            this.field689 = arg0;
        } catch (LineUnavailableException var4) {
            if (class178.method2250(arg0) == 1) {
                this.field690 = null;
                throw var4;
            } else {
                this.method696(class178.method629(arg0));
            }
        }
    }

    @ObfuscatedName("bw.q(B)I")
    public int method702() {
        return this.field689 - (this.field690.available() >> (Statics.field1618 ? 2 : 1));
    }

    @ObfuscatedName("bw.o()V")
    public void method698() {
        int var1 = 256;
        if (Statics.field1618) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1620[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field691[var2 * 2] = (byte) (var3 >> 8);
            this.field691[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field690.write(this.field691, 0, var1 << 1);
    }

    @ObfuscatedName("bw.g(I)V")
    public void method699() {
        if (this.field690 != null) {
            this.field690.close();
            this.field690 = null;
        }
    }

    @ObfuscatedName("bw.v(B)V")
    public void method700() {
        this.field690.flush();
    }
}
