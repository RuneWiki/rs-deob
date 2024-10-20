package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fo")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fo.s")
    public InputStream field2182;

    @ObfuscatedName("fo.g")
    public OutputStream field2178;

    @ObfuscatedName("fo.m")
    public Socket field2174;

    @ObfuscatedName("fo.h")
    public boolean field2175 = false;

    @ObfuscatedName("fo.i")
    public class157 field2176;

    @ObfuscatedName("fo.w")
    public class156 field2177;

    @ObfuscatedName("fo.t")
    public byte[] field2185;

    @ObfuscatedName("fo.d")
    public int field2179 = 0;

    @ObfuscatedName("fo.z")
    public int field2180 = 0;

    @ObfuscatedName("fo.k")
    public boolean field2181 = false;

    @ObfuscatedName("fo.c")
    public final int field2173;

    @ObfuscatedName("fo.o")
    public final int field2183;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2176 = arg1;
        this.field2174 = arg0;
        this.field2173 = arg2;
        this.field2183 = arg2 - 100;
        this.field2174.setSoTimeout(30000);
        this.field2174.setTcpNoDelay(true);
        this.field2174.setReceiveBufferSize(65536);
        this.field2174.setSendBufferSize(65536);
        this.field2182 = this.field2174.getInputStream();
        this.field2178 = this.field2174.getOutputStream();
    }

    @ObfuscatedName("fo.w(I)V")
    public void method3022() {
        if (this.field2175) {
            return;
        }
        synchronized (this) {
            this.field2175 = true;
            this.notifyAll();
        }
        if (this.field2177 != null) {
            while (this.field2177.field2128 == 0) {
                class193.method2520(1L);
            }
            if (this.field2177.field2128 == 1) {
                try {
                    ((Thread) this.field2177.field2130).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2177 = null;
    }

    public void finalize() {
        this.method3022();
    }

    @ObfuscatedName("fo.m(B)I")
    public int method3024() throws IOException {
        return this.field2175 ? 0 : this.field2182.read();
    }

    @ObfuscatedName("fo.g(I)I")
    public int method3019() throws IOException {
        return this.field2175 ? 0 : this.field2182.available();
    }

    @ObfuscatedName("fo.s(II)Z")
    public boolean method3018(int arg0) throws IOException {
        if (this.field2175) {
            return false;
        }
        try {
            return this.field2182.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("fo.h([BIIB)I")
    public int method3021(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2175) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2182.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fo.ad([BIII)V")
    public void method3052(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2175) {
            return;
        }
        if (this.field2181) {
            this.field2181 = false;
            throw new IOException();
        }
        if (this.field2185 == null) {
            this.field2185 = new byte[this.field2173];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2185[this.field2180] = arg0[arg1 + var5];
                this.field2180 = (this.field2180 + 1) % this.field2173;
                if ((this.field2183 + this.field2179) % this.field2173 == this.field2180) {
                    throw new IOException();
                }
            }
            if (this.field2177 == null) {
                this.field2177 = this.field2176.method2993(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2180 == this.field2179) {
                            if (this.field2175) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2179;
                        if (this.field2180 >= this.field2179) {
                            var4 = this.field2180 - this.field2179;
                        } else {
                            var4 = this.field2173 - this.field2179;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2178.write(this.field2185, var3, var4);
                    } catch (IOException var12) {
                        this.field2181 = true;
                    }
                    this.field2179 = (this.field2179 + var4) % this.field2173;
                    try {
                        if (this.field2180 == this.field2179) {
                            this.field2178.flush();
                        }
                    } catch (IOException var11) {
                        this.field2181 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2182 != null) {
                        this.field2182.close();
                    }
                    if (this.field2178 != null) {
                        this.field2178.close();
                    }
                    if (this.field2174 != null) {
                        this.field2174.close();
                    }
                } catch (IOException var10) {
                }
                this.field2185 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method73((String) null, var15);
        }
    }

    @ObfuscatedName("fo.i([BIII)V")
    public void method3029(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3052(arg0, arg1, arg2);
    }
}
