package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bm")
public class class65 extends class52 {

    @ObfuscatedName("bm.n")
    public AudioFormat field1215;

    @ObfuscatedName("bm.w")
    public SourceDataLine field1217;

    @ObfuscatedName("bm.aq")
    public int field1216;

    @ObfuscatedName("bm.as")
    public byte[] field1214;

    @ObfuscatedName("bm.n(Ljava/awt/Component;)V")
    public void method998(Component arg0) {
        this.field1215 = new AudioFormat((float) Statics.field1118, 16, Statics.field1103 ? 2 : 1, true, false);
        this.field1214 = new byte[0x100 << (Statics.field1103 ? 2 : 1)];
    }

    @ObfuscatedName("bm.w(I)V")
    public void method976(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1215, arg0 << (Statics.field1103 ? 2 : 1));
            this.field1217 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1217.open();
            this.field1217.start();
            this.field1216 = arg0;
        } catch (LineUnavailableException var11) {
            if (class118.method848(arg0) == 1) {
                this.field1217 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method976(var10);
        }
    }

    @ObfuscatedName("bm.i()I")
    public int method977() {
        return this.field1216 - (this.field1217.available() >> (Statics.field1103 ? 2 : 1));
    }

    @ObfuscatedName("bm.e()V")
    public void method978() {
        int var1 = 256;
        if (Statics.field1103) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1104[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1214[var2 * 2] = (byte) (var3 >> 8);
            this.field1214[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1217.write(this.field1214, 0, var1 << 1);
    }

    @ObfuscatedName("bm.h()V")
    public void method979() {
        if (this.field1217 != null) {
            this.field1217.close();
            this.field1217 = null;
        }
    }

    @ObfuscatedName("bm.q()V")
    public void method980() {
        this.field1217.flush();
    }
}
