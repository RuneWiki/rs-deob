package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("br")
public class class60 extends class115 {

    @ObfuscatedName("br.z")
    public AudioFormat field448;

    @ObfuscatedName("br.k")
    public SourceDataLine field450;

    @ObfuscatedName("br.s")
    public int field447;

    @ObfuscatedName("br.t")
    public byte[] field449;

    @ObfuscatedName("br.z(I)V")
    public void method773() {
        this.field448 = new AudioFormat((float) Statics.field1448, 16, Statics.field1432 ? 2 : 1, true, false);
        this.field449 = new byte[0x100 << (Statics.field1432 ? 2 : 1)];
    }

    @ObfuscatedName("br.k(IB)V")
    public void method776(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field448, arg0 << (Statics.field1432 ? 2 : 1));
            this.field450 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field450.open();
            this.field450.start();
            this.field447 = arg0;
        } catch (LineUnavailableException var4) {
            if (class198.method761(arg0) == 1) {
                this.field450 = null;
                throw var4;
            } else {
                this.method776(class198.method4962(arg0));
            }
        }
    }

    @ObfuscatedName("br.s(B)I")
    public int method775() {
        return this.field447 - (this.field450.available() >> (Statics.field1432 ? 2 : 1));
    }

    @ObfuscatedName("br.t()V")
    public void method791() {
        int var1 = 256;
        if (Statics.field1432) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1434[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field449[var2 * 2] = (byte) (var3 >> 8);
            this.field449[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field450.write(this.field449, 0, var1 << 1);
    }

    @ObfuscatedName("br.i(I)V")
    public void method777() {
        if (this.field450 != null) {
            this.field450.close();
            this.field450 = null;
        }
    }

    @ObfuscatedName("br.o(I)V")
    public void method774() {
        this.field450.flush();
    }
}
