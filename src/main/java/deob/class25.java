package deob;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ah")
public class class25 extends class43 {

    @ObfuscatedName("ah.aj")
    public AudioFormat field134;

    @ObfuscatedName("ah.al")
    public SourceDataLine field133;

    @ObfuscatedName("ah.ac")
    public int field131;

    @ObfuscatedName("ah.ab")
    public byte[] field132;

    @ObfuscatedName("ah.aj(I)V")
    public void method311() {
        this.field134 = new AudioFormat((float) Statics.field293, 16, Statics.field992 ? 2 : 1, true, false);
        this.field132 = new byte[0x100 << (Statics.field992 ? 2 : 1)];
    }

    @ObfuscatedName("ah.al(IB)V")
    public void method312(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field134, arg0 << (Statics.field992 ? 2 : 1));
            this.field133 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field133.open();
            this.field133.start();
            this.field131 = arg0;
        } catch (LineUnavailableException var4) {
            if (class292.method4963(arg0) == 1) {
                this.field133 = null;
                throw var4;
            } else {
                this.method312(class292.method4415(arg0));
            }
        }
    }

    @ObfuscatedName("ah.ac(B)I")
    public int method327() {
        return this.field131 - (this.field133.available() >> (Statics.field992 ? 2 : 1));
    }

    @ObfuscatedName("ah.ab()V")
    public void method314() {
        int var1 = 256;
        if (Statics.field992) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field285[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field132[var2 * 2] = (byte) (var3 >> 8);
            this.field132[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field133.write(this.field132, 0, var1 << 1);
    }

    @ObfuscatedName("ah.an(B)V")
    public void method315() {
        if (this.field133 != null) {
            this.field133.close();
            this.field133 = null;
        }
    }

    @ObfuscatedName("ah.ao(S)V")
    public void method316() {
        this.field133.flush();
    }
}
