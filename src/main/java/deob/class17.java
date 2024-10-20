package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("c")
public class class17 {

    @ObfuscatedName("c.x")
    public int field232;

    @ObfuscatedName("c.v")
    public class135 field225;

    @ObfuscatedName("c.m")
    public DataInputStream field224;

    @ObfuscatedName("c.e")
    public byte[] field222 = new byte[4];

    @ObfuscatedName("c.h")
    public int field226;

    @ObfuscatedName("c.p")
    public byte[] field227;

    @ObfuscatedName("c.j")
    public int field228;

    @ObfuscatedName("c.i")
    public long field229;

    public class17(class125 arg0, URL arg1) {
        this.field225 = arg0.method2510(arg1);
        this.field232 = 0;
        this.field229 = class104.method27() + 30000L;
    }

    @ObfuscatedName("c.x(I)[B")
    public byte[] method146() throws IOException {
        if (class104.method27() > this.field229) {
            throw new IOException();
        }
        if (this.field232 == 0) {
            if (this.field225.field2070 == 2) {
                throw new IOException();
            }
            if (this.field225.field2070 == 1) {
                this.field224 = (DataInputStream) this.field225.field2067;
                this.field232 = 1;
            }
        }
        if (this.field232 == 1) {
            int var1 = this.field224.available();
            if (var1 > 0) {
                if (this.field226 + var1 > 4) {
                    var1 = 4 - this.field226;
                }
                this.field226 += this.field224.read(this.field222, this.field226, var1);
                if (this.field226 == 4) {
                    int var2 = (new class108(this.field222)).method2132();
                    this.field227 = new byte[var2];
                    this.field232 = 2;
                }
            }
        }
        if (this.field232 == 2) {
            int var3 = this.field224.available();
            if (var3 > 0) {
                if (this.field228 + var3 > this.field227.length) {
                    var3 = this.field227.length - this.field228;
                }
                this.field228 += this.field224.read(this.field227, this.field228, var3);
                if (this.field228 == this.field227.length) {
                    return this.field227;
                }
            }
        }
        return null;
    }
}
