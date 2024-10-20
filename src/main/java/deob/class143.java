package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ek")
public final class class143 implements Runnable {

    @ObfuscatedName("ek.g")
    public InputStream field2176;

    @ObfuscatedName("ek.b")
    public OutputStream field2175;

    @ObfuscatedName("ek.w")
    public Socket field2177;

    @ObfuscatedName("ek.d")
    public boolean field2184 = false;

    @ObfuscatedName("ek.z")
    public class136 field2178;

    @ObfuscatedName("ek.l")
    public class146 field2179;

    @ObfuscatedName("ek.m")
    public byte[] field2186;

    @ObfuscatedName("ek.p")
    public int field2181 = 0;

    @ObfuscatedName("ek.u")
    public int field2180 = 0;

    @ObfuscatedName("ek.c")
    public boolean field2183 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2178 = arg1;
        this.field2177 = arg0;
        this.field2177.setSoTimeout(30000);
        this.field2177.setTcpNoDelay(true);
        this.field2177.setReceiveBufferSize(16384);
        this.field2177.setSendBufferSize(16384);
        this.field2176 = this.field2177.getInputStream();
        this.field2175 = this.field2177.getOutputStream();
    }

    @ObfuscatedName("ek.b(B)V")
    public void method2856() {
        if (this.field2184) {
            return;
        }
        synchronized (this) {
            this.field2184 = true;
            this.notifyAll();
        }
        if (this.field2179 != null) {
            while (this.field2179.field2216 == 0) {
                class127.method2632(1L);
            }
            if (this.field2179.field2216 == 1) {
                try {
                    ((Thread) this.field2179.field2217).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2179 = null;
    }

    public void finalize() {
        this.method2856();
    }

    @ObfuscatedName("ek.w(B)I")
    public int method2862() throws IOException {
        return this.field2184 ? 0 : this.field2176.read();
    }

    @ObfuscatedName("ek.d(I)I")
    public int method2860() throws IOException {
        return this.field2184 ? 0 : this.field2176.available();
    }

    @ObfuscatedName("ek.z([BIII)V")
    public void method2858(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2184) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2176.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ek.l([BIIB)V")
    public void method2859(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2184) {
            return;
        }
        if (this.field2183) {
            this.field2183 = false;
            throw new IOException();
        }
        if (this.field2186 == null) {
            this.field2186 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2186[this.field2180] = arg0[arg1 + var5];
                this.field2180 = (this.field2180 + 1) % 5000;
                if ((this.field2181 + 4900) % 5000 == this.field2180) {
                    throw new IOException();
                }
            }
            if (this.field2179 == null) {
                this.field2179 = this.field2178.method2742(this, 3);
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
                        if (this.field2181 == this.field2180) {
                            if (this.field2184) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2181;
                        if (this.field2180 >= this.field2181) {
                            var4 = this.field2180 - this.field2181;
                        } else {
                            var4 = 5000 - this.field2181;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2175.write(this.field2186, var3, var4);
                    } catch (IOException var12) {
                        this.field2183 = true;
                    }
                    this.field2181 = (this.field2181 + var4) % 5000;
                    try {
                        if (this.field2181 == this.field2180) {
                            this.field2175.flush();
                        }
                    } catch (IOException var11) {
                        this.field2183 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2176 != null) {
                        this.field2176.close();
                    }
                    if (this.field2175 != null) {
                        this.field2175.close();
                    }
                    if (this.field2177 != null) {
                        this.field2177.close();
                    }
                } catch (IOException var10) {
                }
                this.field2186 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2631((String) null, var15);
        }
    }
}
