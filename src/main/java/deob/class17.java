package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("j")
public class class17 {

    @ObfuscatedName("j.e")
    public int field247;

    @ObfuscatedName("j.v")
    public class133 field250;

    @ObfuscatedName("j.i")
    public byte[] field255 = new byte[4];

    @ObfuscatedName("j.g")
    public DataInputStream field245;

    @ObfuscatedName("j.x")
    public int field258;

    @ObfuscatedName("j.b")
    public byte[] field248;

    @ObfuscatedName("j.q")
    public int field249;

    @ObfuscatedName("j.l")
    public long field256;

    public class17(class123 arg0, URL arg1) {
        this.field250 = arg0.method2486(arg1);
        this.field247 = 0;
        this.field256 = class103.method1957() + 30000L;
    }

    @ObfuscatedName("j.e(I)[B")
    public byte[] method156() throws IOException {
        if (class103.method1957() > this.field256) {
            throw new IOException();
        }
        if (this.field247 == 0) {
            if (this.field250.field2063 == 2) {
                throw new IOException();
            }
            if (this.field250.field2063 == 1) {
                this.field245 = (DataInputStream) this.field250.field2060;
                this.field247 = 1;
            }
        }
        if (this.field247 == 1) {
            int var1 = this.field245.available();
            if (var1 > 0) {
                if (this.field258 + var1 > 4) {
                    var1 = 4 - this.field258;
                }
                this.field258 += this.field245.read(this.field255, this.field258, var1);
                if (this.field258 == 4) {
                    int var2 = (new class107(this.field255)).method2121();
                    this.field248 = new byte[var2];
                    this.field247 = 2;
                }
            }
        }
        if (this.field247 == 2) {
            int var3 = this.field245.available();
            if (var3 > 0) {
                if (this.field249 + var3 > this.field248.length) {
                    var3 = this.field248.length - this.field249;
                }
                this.field249 += this.field245.read(this.field248, this.field249, var3);
                if (this.field249 == this.field248.length) {
                    return this.field248;
                }
            }
        }
        return null;
    }
}
