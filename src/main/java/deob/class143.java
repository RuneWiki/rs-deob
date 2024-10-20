package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ew")
public final class class143 implements Runnable {

    @ObfuscatedName("ew.l")
    public InputStream field2177;

    @ObfuscatedName("ew.e")
    public OutputStream field2183;

    @ObfuscatedName("ew.q")
    public Socket field2178;

    @ObfuscatedName("ew.o")
    public boolean field2184 = false;

    @ObfuscatedName("ew.g")
    public class136 field2181;

    @ObfuscatedName("ew.m")
    public class146 field2182;

    @ObfuscatedName("ew.b")
    public byte[] field2187;

    @ObfuscatedName("ew.p")
    public int field2179 = 0;

    @ObfuscatedName("ew.t")
    public int field2185 = 0;

    @ObfuscatedName("ew.w")
    public boolean field2186 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2181 = arg1;
        this.field2178 = arg0;
        this.field2178.setSoTimeout(30000);
        this.field2178.setTcpNoDelay(true);
        this.field2178.setReceiveBufferSize(16384);
        this.field2178.setSendBufferSize(16384);
        this.field2177 = this.field2178.getInputStream();
        this.field2183 = this.field2178.getOutputStream();
    }

    @ObfuscatedName("ew.o(B)V")
    public void method2823() {
        if (this.field2184) {
            return;
        }
        synchronized (this) {
            this.field2184 = true;
            this.notifyAll();
        }
        if (this.field2182 != null) {
            while (this.field2182.field2215 == 0) {
                class127.method2667(1L);
            }
            if (this.field2182.field2215 == 1) {
                try {
                    ((Thread) this.field2182.field2211).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2182 = null;
    }

    public void finalize() {
        this.method2823();
    }

    @ObfuscatedName("ew.g(I)I")
    public int method2826() throws IOException {
        return this.field2184 ? 0 : this.field2177.read();
    }

    @ObfuscatedName("ew.m(B)I")
    public int method2824() throws IOException {
        return this.field2184 ? 0 : this.field2177.available();
    }

    @ObfuscatedName("ew.b([BIIB)V")
    public void method2825(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2184) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2177.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ew.p([BIII)V")
    public void method2840(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2184) {
            return;
        }
        if (this.field2186) {
            this.field2186 = false;
            throw new IOException();
        }
        if (this.field2187 == null) {
            this.field2187 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2187[this.field2185] = arg0[arg1 + var5];
                this.field2185 = (this.field2185 + 1) % 5000;
                if ((this.field2179 + 4900) % 5000 == this.field2185) {
                    throw new IOException();
                }
            }
            if (this.field2182 == null) {
                this.field2182 = this.field2181.method2736(this, 3);
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
                        if (this.field2185 == this.field2179) {
                            if (this.field2184) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2179;
                        if (this.field2185 >= this.field2179) {
                            var4 = this.field2185 - this.field2179;
                        } else {
                            var4 = 5000 - this.field2179;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2183.write(this.field2187, var3, var4);
                    } catch (IOException var12) {
                        this.field2186 = true;
                    }
                    this.field2179 = (this.field2179 + var4) % 5000;
                    try {
                        if (this.field2185 == this.field2179) {
                            this.field2183.flush();
                        }
                    } catch (IOException var11) {
                        this.field2186 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2177 != null) {
                        this.field2177.close();
                    }
                    if (this.field2183 != null) {
                        this.field2183.close();
                    }
                    if (this.field2178 != null) {
                        this.field2178.close();
                    }
                } catch (IOException var10) {
                }
                this.field2187 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2819((String) null, var15);
        }
    }
}
