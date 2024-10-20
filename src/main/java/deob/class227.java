package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("il")
public class class227 {

    @ObfuscatedName("il.ad")
    public Map field2427 = new HashMap();

    @ObfuscatedName("il.ag")
    public int field2425 = 0;

    @ObfuscatedName("il.ak")
    public static final class227 field2424 = new class227();

    @ObfuscatedName("il.aq(Lorg/json/JSONObject;ILea;I)V")
    public void method4002(JSONObject arg0, int arg1, class117 arg2) {
        this.field2427.clear();
        JSONObject var4;
        try {
            var4 = arg0;
            this.field2425 = arg1;
            arg0.getLong("lastfullsyncat");
            arg0.getLong("lastcardupdatedat");
        } catch (Exception var8) {
            return;
        }
        try {
            this.method3998(var4.getJSONArray("crmcomponents"), this.field2425, arg2);
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("il.ad(Lorg/json/JSONArray;ILea;B)V")
    public void method3998(JSONArray arg0, int arg1, class117 arg2) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            JSONObject var5 = arg0.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
                String var6 = var5.getString("platform");
                if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                    class225 var7 = new class225();
                    try {
                        var7.method3962(var5, arg1, arg2);
                    } catch (Exception var10) {
                    }
                    if (!var7.field2404.isEmpty()) {
                        String var9 = var5.getString("location");
                        this.field2427.put(var9, var7);
                    }
                }
            }
        }
        this.field2427 = this.method3994();
        class327.method4500();
    }

    @ObfuscatedName("il.ag(B)Ljava/util/Map;")
    public Map method3994() {
        HashMap var1 = new HashMap();
        ArrayList var2 = new ArrayList();
        var2.addAll(this.field2427.entrySet());
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < var2.size() - 1; var4++) {
                if (((class225) ((Entry) var2.get(var4)).getValue()).method3974() > ((class225) ((Entry) var2.get(var4 + 1)).getValue()).method3974()) {
                    Entry var5 = (Entry) var2.get(var4);
                    var2.set(var4, var2.get(var4 + 1));
                    var2.set(var4 + 1, var5);
                    var3 = false;
                }
            }
        }
        Iterator var6 = var2.iterator();
        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            var1.put(var7.getKey(), var7.getValue());
        }
        return var1;
    }

    @ObfuscatedName("il.ak(Ljava/lang/String;S)Lif;")
    public class225 method3995(String arg0) {
        return (class225) this.field2427.get(arg0);
    }
}
