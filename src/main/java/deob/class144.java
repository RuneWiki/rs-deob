package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eu")
public final class class144 implements Runnable {

    @ObfuscatedName("eu.f")
    public InputStream field2189;

    @ObfuscatedName("eu.u")
    public OutputStream field2179;

    @ObfuscatedName("eu.x")
    public Socket field2180;

    @ObfuscatedName("eu.b")
    public boolean field2181 = false;

    @ObfuscatedName("eu.l")
    public class137 field2182;

    @ObfuscatedName("eu.d")
    public class147 field2183;

    @ObfuscatedName("eu.n")
    public byte[] field2178;

    @ObfuscatedName("eu.m")
    public int field2185 = 0;

    @ObfuscatedName("eu.g")
    public int field2186 = 0;

    @ObfuscatedName("eu.s")
    public boolean field2187 = false;

    public class144(Socket arg0, class137 arg1) throws IOException {
        this.field2182 = arg1;
        this.field2180 = arg0;
        this.field2180.setSoTimeout(30000);
        this.field2180.setTcpNoDelay(true);
        this.field2180.setReceiveBufferSize(16384);
        this.field2180.setSendBufferSize(16384);
        this.field2189 = this.field2180.getInputStream();
        this.field2179 = this.field2180.getOutputStream();
    }

    @ObfuscatedName("eu.d(B)V")
    public void method2832() {
        if (this.field2181) {
            return;
        }
        synchronized (this) {
            this.field2181 = true;
            this.notifyAll();
        }
        if (this.field2183 != null) {
            while (this.field2183.field2215 == 0) {
                class128.method2102(1L);
            }
            if (this.field2183.field2215 == 1) {
                try {
                    ((Thread) this.field2183.field2217).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2183 = null;
    }

    public void finalize() {
        this.method2832();
    }

    @ObfuscatedName("eu.n(I)I")
    public int method2834() throws IOException {
        return this.field2181 ? 0 : this.field2189.read();
    }

    @ObfuscatedName("eu.m(I)I")
    public int method2831() throws IOException {
        return this.field2181 ? 0 : this.field2189.available();
    }

    @ObfuscatedName("eu.g([BIII)V")
    public void method2855(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2181) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2189.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eu.s([BIII)V")
    public void method2837(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2181) {
            return;
        }
        if (this.field2187) {
            this.field2187 = false;
            throw new IOException();
        }
        if (this.field2178 == null) {
            this.field2178 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2178[this.field2186] = arg0[arg1 + var5];
                this.field2186 = (this.field2186 + 1) % 5000;
                if ((this.field2185 + 4900) % 5000 == this.field2186) {
                    throw new IOException();
                }
            }
            if (this.field2183 == null) {
                this.field2183 = this.field2182.method2729(this, 3);
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
                        if (this.field2186 == this.field2185) {
                            if (this.field2181) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2185;
                        if (this.field2186 >= this.field2185) {
                            var4 = this.field2186 - this.field2185;
                        } else {
                            var4 = 5000 - this.field2185;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2179.write(this.field2178, var3, var4);
                    } catch (IOException var12) {
                        this.field2187 = true;
                    }
                    this.field2185 = (this.field2185 + var4) % 5000;
                    try {
                        if (this.field2186 == this.field2185) {
                            this.field2179.flush();
                        }
                    } catch (IOException var11) {
                        this.field2187 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2189 != null) {
                        this.field2189.close();
                    }
                    if (this.field2179 != null) {
                        this.field2179.close();
                    }
                    if (this.field2180 != null) {
                        this.field2180.close();
                    }
                } catch (IOException var10) {
                }
                this.field2178 = null;
                break;
            }
        } catch (Exception var15) {
            class149.method957((String) null, var15);
        }
    }
}
