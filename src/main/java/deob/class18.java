package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("s")
public class class18 {

    @ObfuscatedName("s.n")
    public int field225;

    @ObfuscatedName("s.d")
    public class138 field234;

    @ObfuscatedName("s.z")
    public DataInputStream field226;

    @ObfuscatedName("s.y")
    public byte[] field227 = new byte[4];

    @ObfuscatedName("s.e")
    public int field228;

    @ObfuscatedName("s.g")
    public byte[] field229;

    @ObfuscatedName("s.f")
    public int field230;

    @ObfuscatedName("s.m")
    public long field231;

    public class18(class128 arg0, URL arg1) {
        this.field234 = arg0.method2626(arg1);
        this.field225 = 0;
        this.field231 = class107.method1670() + 30000L;
    }

    @ObfuscatedName("s.n(I)[B")
    public byte[] method174() throws IOException {
        if (class107.method1670() > this.field231) {
            throw new IOException();
        }
        if (this.field225 == 0) {
            if (this.field234.field2118 == 2) {
                throw new IOException();
            }
            if (this.field234.field2118 == 1) {
                this.field226 = (DataInputStream) this.field234.field2114;
                this.field225 = 1;
            }
        }
        if (this.field225 == 1) {
            int var1 = this.field226.available();
            if (var1 > 0) {
                if (this.field228 + var1 > 4) {
                    var1 = 4 - this.field228;
                }
                this.field228 += this.field226.read(this.field227, this.field228, var1);
                if (this.field228 == 4) {
                    int var2 = (new class111(this.field227)).method2233();
                    this.field229 = new byte[var2];
                    this.field225 = 2;
                }
            }
        }
        if (this.field225 == 2) {
            int var3 = this.field226.available();
            if (var3 > 0) {
                if (this.field230 + var3 > this.field229.length) {
                    var3 = this.field229.length - this.field230;
                }
                this.field230 += this.field226.read(this.field229, this.field230, var3);
                if (this.field230 == this.field229.length) {
                    return this.field229;
                }
            }
        }
        return null;
    }
}
