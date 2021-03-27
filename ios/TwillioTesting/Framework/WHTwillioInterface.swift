
import Foundation

final class TwillioInterface {
    
    var launchFlow: LaunchFlow?
    var launchFlowFactory: LaunchFlowFactory = LaunchFlowFactoryImpl()
    var launchStoresFactory: LaunchStoresFactory = LaunchStoresFactoryImpl()
    
    var accessToken :String!
    var roomName: String!
    
    private init(){}
    
    static let shared = TwillioInterface()
    
    
    func launchTwillio(window:UIWindow!) {
        launchStoresFactory.makeLaunchStores().forEach { $0.start() }
        launchFlow = launchFlowFactory.makeLaunchFlow(window: window)
        
    }
    
    func startTwilllio() {
        launchFlow?.start()
    }
}


extension UIApplication {

    func getKeyWindow() -> UIWindow? {
        if #available(iOS 13, *) {
            return windows.first { $0.isKeyWindow }
        } else {
            return keyWindow
        }
    }

  //  func makeSnapshot() -> UIImage? { return getKeyWindow()?.layer.makeSnapshot() }
}
