(ns io.github.setupminimal.glass.Glass)

(import net.minecraft.item.Item
        net.minecraft.creativetab.CreativeTabs
        net.minecraftforge.fml.common.registry.GameRegistry)

(defn registerLens
  "The hand-held lens items."
  [event]
  (let [lensItem (doto (proxy [Item] [])
                   (.setMaxStackSize 64)
                   (.setCreativeTab CreativeTabs/tabMisc)
                   (.setUnlocalizedName "lensItem"))]
    (GameRegistry/registerItem lensItem "lensItem")))

(defn main [instance]
  (. instance addInitializationCallback
    registerLens))