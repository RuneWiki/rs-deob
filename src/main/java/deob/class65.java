package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bc")
public class class65 extends class52 {

    @ObfuscatedName("bc.n")
    public AudioFormat field1241;

    @ObfuscatedName("bc.g")
    public SourceDataLine field1240;

    @ObfuscatedName("bc.az")
    public int field1239;

    @ObfuscatedName("bc.ah")
    public byte[] field1242;

    @ObfuscatedName("bc.n(Ljava/awt/Component;)V")
    public void method970(Component arg0) {
        this.field1241 = new AudioFormat((float) Statics.field1142, 16, Statics.field1146 ? 2 : 1, true, false);
        this.field1242 = new byte[0x100 << (Statics.field1146 ? 2 : 1)];
    }

    @ObfuscatedName("bc.g(I)V")
    public void method977(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1241, arg0 << (Statics.field1146 ? 2 : 1));
            this.field1240 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1240.open();
            this.field1240.start();
            this.field1239 = arg0;
        } catch (LineUnavailableException var11) {
            if (class118.method736(arg0) == 1) {
                this.field1240 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method977(var10);
        }
    }

    @ObfuscatedName("bc.a()I")
    public int method972() {
        return this.field1239 - (this.field1240.available() >> (Statics.field1146 ? 2 : 1));
    }

    @ObfuscatedName("bc.m()V")
    public void method969() {
        int var1 = 256;
        if (Statics.field1146) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1134[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1242[var2 * 2] = (byte) (var3 >> 8);
            this.field1242[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1240.write(this.field1242, 0, var1 << 1);
    }

    @ObfuscatedName("bc.s()V")
    public void method987() {
        if (this.field1240 != null) {
            this.field1240.close();
            this.field1240 = null;
        }
    }

    @ObfuscatedName("bc.j()V")
    public void method978() {
        this.field1240.flush();
    }
}
