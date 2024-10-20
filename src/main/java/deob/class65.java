package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bo")
public class class65 extends class52 {

    @ObfuscatedName("bo.p")
    public AudioFormat field1223;

    @ObfuscatedName("bo.k")
    public SourceDataLine field1224;

    @ObfuscatedName("bo.az")
    public int field1225;

    @ObfuscatedName("bo.aq")
    public byte[] field1226;

    @ObfuscatedName("bo.p(Ljava/awt/Component;)V")
    public void method981(Component arg0) {
        this.field1223 = new AudioFormat((float) Statics.field1494, 16, Statics.field1128 ? 2 : 1, true, false);
        this.field1226 = new byte[0x100 << (Statics.field1128 ? 2 : 1)];
    }

    @ObfuscatedName("bo.k(I)V")
    public void method965(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1223, arg0 << (Statics.field1128 ? 2 : 1));
            this.field1224 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1224.open();
            this.field1224.start();
            this.field1225 = arg0;
        } catch (LineUnavailableException var4) {
            if (class118.method3032(arg0) == 1) {
                this.field1224 = null;
                throw var4;
            } else {
                this.method965(class118.method636(arg0));
            }
        }
    }

    @ObfuscatedName("bo.e()I")
    public int method966() {
        return this.field1225 - (this.field1224.available() >> (Statics.field1128 ? 2 : 1));
    }

    @ObfuscatedName("bo.f()V")
    public void method967() {
        int var1 = 256;
        if (Statics.field1128) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1120[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1226[var2 * 2] = (byte) (var3 >> 8);
            this.field1226[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1224.write(this.field1226, 0, var1 << 1);
    }

    @ObfuscatedName("bo.w()V")
    public void method968() {
        if (this.field1224 != null) {
            this.field1224.close();
            this.field1224 = null;
        }
    }

    @ObfuscatedName("bo.t()V")
    public void method969() {
        this.field1224.flush();
    }
}
