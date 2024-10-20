package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bm")
public class class64 extends class51 {

    @ObfuscatedName("bm.e")
    public AudioFormat field1208;

    @ObfuscatedName("bm.v")
    public SourceDataLine field1207;

    @ObfuscatedName("bm.af")
    public int field1206;

    @ObfuscatedName("bm.ah")
    public byte[] field1209;

    @ObfuscatedName("bm.e(Ljava/awt/Component;)V")
    public void method925(Component arg0) {
        this.field1208 = new AudioFormat((float) Statics.field1108, 16, Statics.field1092 ? 2 : 1, true, false);
        this.field1209 = new byte[0x100 << (Statics.field1092 ? 2 : 1)];
    }

    @ObfuscatedName("bm.v(I)V")
    public void method926(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1208, arg0 << (Statics.field1092 ? 2 : 1));
            this.field1207 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1207.open();
            this.field1207.start();
            this.field1206 = arg0;
        } catch (LineUnavailableException var4) {
            if (class115.method557(arg0) == 1) {
                this.field1207 = null;
                throw var4;
            } else {
                this.method926(class115.method2674(arg0));
            }
        }
    }

    @ObfuscatedName("bm.k()I")
    public int method944() {
        return this.field1206 - (this.field1207.available() >> (Statics.field1092 ? 2 : 1));
    }

    @ObfuscatedName("bm.g()V")
    public void method927() {
        int var1 = 256;
        if (Statics.field1092) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1097[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1209[var2 * 2] = (byte) (var3 >> 8);
            this.field1209[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1207.write(this.field1209, 0, var1 << 1);
    }

    @ObfuscatedName("bm.q()V")
    public void method929() {
        if (this.field1207 != null) {
            this.field1207.close();
            this.field1207 = null;
        }
    }

    @ObfuscatedName("bm.l()V")
    public void method930() {
        this.field1207.flush();
    }
}
