package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bw")
public class class70 extends class57 {

    @ObfuscatedName("bw.a")
    public AudioFormat field1286;

    @ObfuscatedName("bw.r")
    public SourceDataLine field1285;

    @ObfuscatedName("bw.ax")
    public int field1284;

    @ObfuscatedName("bw.ak")
    public byte[] field1287;

    @ObfuscatedName("bw.a(Ljava/awt/Component;)V")
    public void method1103(Component arg0) {
        this.field1286 = new AudioFormat((float) Statics.field1186, 16, Statics.field1174 ? 2 : 1, true, false);
        this.field1287 = new byte[0x100 << (Statics.field1174 ? 2 : 1)];
    }

    @ObfuscatedName("bw.r(I)V")
    public void method1105(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1286, arg0 << (Statics.field1174 ? 2 : 1));
            this.field1285 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1285.open();
            this.field1285.start();
            this.field1284 = arg0;
        } catch (LineUnavailableException var11) {
            if (class126.method650(arg0) == 1) {
                this.field1285 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1105(var10);
        }
    }

    @ObfuscatedName("bw.f()I")
    public int method1106() {
        return this.field1284 - (this.field1285.available() >> (Statics.field1174 ? 2 : 1));
    }

    @ObfuscatedName("bw.s()V")
    public void method1107() {
        int var1 = 256;
        if (Statics.field1174) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1183[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1287[var2 * 2] = (byte) (var3 >> 8);
            this.field1287[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1285.write(this.field1287, 0, var1 << 1);
    }

    @ObfuscatedName("bw.y()V")
    public void method1108() {
        if (this.field1285 != null) {
            this.field1285.close();
            this.field1285 = null;
        }
    }

    @ObfuscatedName("bw.e()V")
    public void method1104() {
        this.field1285.flush();
    }
}
