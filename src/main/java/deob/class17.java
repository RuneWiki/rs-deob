package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("c")
public class class17 {

    @ObfuscatedName("c.e")
    public int field229;

    @ObfuscatedName("c.v")
    public class135 field228;

    @ObfuscatedName("c.k")
    public DataInputStream field238;

    @ObfuscatedName("c.g")
    public byte[] field230 = new byte[4];

    @ObfuscatedName("c.q")
    public int field231;

    @ObfuscatedName("c.l")
    public byte[] field233;

    @ObfuscatedName("c.a")
    public int field227;

    @ObfuscatedName("c.b")
    public long field234;

    public class17(class125 arg0, URL arg1) {
        this.field228 = arg0.method2485(arg1);
        this.field229 = 0;
        this.field234 = class104.method567() + 30000L;
    }

    @ObfuscatedName("c.e(I)[B")
    public byte[] method152() throws IOException {
        if (class104.method567() > this.field234) {
            throw new IOException();
        }
        if (this.field229 == 0) {
            if (this.field228.field2075 == 2) {
                throw new IOException();
            }
            if (this.field228.field2075 == 1) {
                this.field238 = (DataInputStream) this.field228.field2079;
                this.field229 = 1;
            }
        }
        if (this.field229 == 1) {
            int var1 = this.field238.available();
            if (var1 > 0) {
                if (this.field231 + var1 > 4) {
                    var1 = 4 - this.field231;
                }
                this.field231 += this.field238.read(this.field230, this.field231, var1);
                if (this.field231 == 4) {
                    int var2 = (new class108(this.field230)).method2127();
                    this.field233 = new byte[var2];
                    this.field229 = 2;
                }
            }
        }
        if (this.field229 == 2) {
            int var3 = this.field238.available();
            if (var3 > 0) {
                if (this.field227 + var3 > this.field233.length) {
                    var3 = this.field233.length - this.field227;
                }
                this.field227 += this.field238.read(this.field233, this.field227, var3);
                if (this.field227 == this.field233.length) {
                    return this.field233;
                }
            }
        }
        return null;
    }
}
